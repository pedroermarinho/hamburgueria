<template>
  <div class="main">
    <v-carousel
      height="250%"
      hide-delimiter-background
      show-arrows-on-hover
      cycle
    >
      <v-carousel-item>
        <v-img src="./../../assets/images/Screenshot_20211114_000917.png" />
      </v-carousel-item>
      <v-carousel-item>
        <v-img src="./../../assets/images/Screenshot_20211114_000956.png" />
      </v-carousel-item>
      <v-carousel-item>
        <v-img src="./../../assets/images/Screenshot_20211114_001023.png" />
      </v-carousel-item>
    </v-carousel>
    <v-app-bar
      color="black accent-4"
      elevation="0"
      height="70"
      dark
      align="center"
    >
      <v-text-field
        solo
        dense
        hide-details
        label="Pesquisar"
        v-model="nome"
        prepend-inner-icon="mdi-magnify"
        @change="pesquisarNome"
      ></v-text-field>
      <v-spacer></v-spacer>
      <v-btn text @click="pushAddProduto()"  v-if="isAdm"> Adicionar Produto </v-btn>
      <v-btn text @click="signOut()"> Sair </v-btn>
    </v-app-bar>

    <v-container id="main">
      <v-row align="center">
        <v-col md="1">
          <v-col>
            <v-btn fab dark large color="#FFBC00" @click="selectComida">
              <v-img
                max-width="40"
                src="./../../assets/images/lunch_dining_black_24dp.svg"
              />
            </v-btn>
          </v-col>
          <v-col>
            <v-btn fab dark large color="#FFBC00" @click="selectBebida">
              <v-img
                max-width="40"
                src="./../../assets/images/sports_bar_black_24dp.svg"
              />
            </v-btn>
          </v-col>
          <v-col>
            <v-btn fab dark large color="#FFBC00" @click="carrinhoLista">
              <v-img
                max-width="40"
                src="./../../assets/images/shopping_cart_black_24dp (2).svg"
              />
            </v-btn>
          </v-col>
        </v-col>
        <v-col class="list" md="10">
          <v-layout row wrap justify-space-around>
            <v-flex v-for="produto in produtos" :key="produto.id" xs5>
              <v-card flat class="card">
                <v-row align="center">
                  <v-col md="3">
                    <v-img
                      v-if="produto.categoria === 'Bebida'"
                      width="100"
                      src="./../../assets/images/Caneca-Cerveja-PNG.png"
                    />
                    <v-img
                      v-if="produto.categoria === 'Comida'"
                      width="100"
                      src="./../../assets/images/AmazonikaBurger-AMZ-min-1024x785.png"
                    />
                  </v-col>
                  <v-col md="7">
                    <v-card-text class="white--text">
                      {{ produto.nome }}
                      <br />
                      {{ produto.descricao }}
                      <br />
                      {{ produto.valor }}
                    </v-card-text>
                  </v-col>
                  <v-col md="1" align="center">
                    <v-btn
                      fab
                      dark
                      color="#FFBC00"
                      @click="addCarrinhoProduto(produto.id)"
                    >
                      <v-img
                        max-width="40"
                        src="./../../assets/images/shopping_cart_black_24dp (2).svg"
                      />
                    </v-btn>
                  </v-col>
                </v-row>
              </v-card>
            </v-flex>
          </v-layout>
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>

<script>
import {
  getProdutosCategoria,
  getCarrinho,
  addCarrinho,
  getProdutosNome,
} from "./../../controller/homeController";
import { mapState, mapActions } from "vuex";

export default {
  name: "Home",

  data() {
    return {
      produtos: [],
      nome:'',
    };
  },
  computed: {
    ...mapState(["user"]),
    isAdm() {
        if (typeof this.user.perfis == "object") {
          return this.user.perfis.includes("ADMIN");
        }
        return false;
      },
  },
  methods: {
    ...mapActions(["ActionSignOut"]),
    signOut: function () {
      this.ActionSignOut();
      this.$router.push({ name: "Login" });
    },
    pushAddProduto: function () {
      this.$router.push({ name: "AddProduto" });
    },
    selectComida: async function () {
      let produtosData = await getProdutosCategoria(1);
      this.produtosList(produtosData);
    },

    selectBebida: async function () {
      let produtosData = await getProdutosCategoria(2);
      this.produtosList(produtosData);
    },

    pesquisarNome: async function(){
      let produtosData = await getProdutosNome(this.nome);
      this.produtosList(produtosData);
    },

    addCarrinhoProduto: async function (produtoID) {
      try {
        await addCarrinho(produtoID);
        await this.carrinhoLista();
      } catch (error) {
        alert(
          error.data
            ? error.data.message
            : "Não foi possível adicionar o produto"
        );
      }
    },
    produtosList: function (produtosData) {
      this.produtos = [];
      produtosData.forEach((element) => {
        const data = {
          id: element.id,
          nome: element.nome,
          categoria: element.categoria.nome,
          descricao: element.descricao,
          valor: element.preco,
        };
        this.produtos.push(data);
      });
    },

    carrinhoLista: async function () {
      this.produtos = [];
      let produtosData = await getCarrinho();
      produtosData.forEach((element) => {
        const data = {
          id: element.id,
          nome: element.produto.nome,
          categoria: element.produto.categoria.nome,
          descricao: element.produto.descricao,
          valor: element.produto.preco,
        };
        this.produtos.push(data);
      });
    },
  },

  async created() {
    this.selectComida();
  },
};
</script>
<style scoped>
#main {
  padding-bottom: 100px;
  padding-top: 100px;
}
.card {
  margin-top: 10px;
  margin-bottom: 10px;
  margin-left: 100px;
  margin-right: 10px;
  height: 150px;
  width: 550px;
  background-color: #323136;
  border-radius: 20px;
}

.list {
  padding-right: 100px;
}
</style>

