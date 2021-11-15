<template>
  <dir>
    <v-container id="main" fluid class="down-top-padding">
      <v-card align="center">
        <form @submit.prevent="submit()">
          <v-card-text>
            <h3
              class="title blue-grey--text text--darken-2 font-weight-regular"
            >
              Cadastro
            </h3>
            <h6 class="subtitle-2 font-weight-light">
              Adicione os atributos de acordo com o campo
            </h6>
          </v-card-text>
          <v-divider></v-divider>
          <v-card-text>
            <v-text-field
              v-model="form.nome"
              label="Nome"
              outlined
              background-color="transparent"
            ></v-text-field>
            <v-text-field
              type="email"
              v-model="form.email"
              label="Email"
              outlined
              background-color="transparent"
            ></v-text-field>
            <v-text-field
              type="number"
              v-model="form.telefone"
              label="Telefone"
              outlined
              background-color="transparent"
            ></v-text-field>
            <v-text-field
              type="password"
              v-model="form.senha"
              label="Senha"
              outlined
              background-color="transparent"
            ></v-text-field>

            <v-btn
              type="submit"
              class="text-capitalize mt-5 element-0"
              color="success"
              >Cadastro</v-btn
            >
            <p class="login-card-footer-text">
              Já tem uma conta ?
              <a href="/login" class="text-reset">Faça login</a>
            </p>
          </v-card-text>
        </form>
      </v-card>
    </v-container>
  </dir>
</template>

<script>
import cadastrar from "./../../controller/cadastroController";
export default {
  name: "Cadastro",
  data() {
    return {
      form: {
        nome: "",
        email: "",
        telefone: "",
        senha: "",
      },
    };
  },
  methods: {
    async submit() {
      try {
        console.log(this.form)
        await cadastrar(this.form);
        this.$router.push({ name: "Login" });
      } catch (error) {
        alert(
          error.data ? error.data.message : "Não foi possível fazer o cadastro"
        );
      }
    },
  },
};
</script>
<style scoped>
#main {
  padding-bottom: 100px;
  padding-top: 100px;
  padding-left: 30%;
  padding-right: 30%;
  background-color: #323136;
}
</style>
