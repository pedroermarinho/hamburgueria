<template>
  <dir>
    <v-container id="main" fluid class="down-top-padding">
      <v-card align="center">
        <form @submit.prevent="submit()">
          <v-card-text>
            <h3
              class="title blue-grey--text text--darken-2 font-weight-regular"
            >
              Login
            </h3>
            <h6 class="subtitle-2 font-weight-light">
              Adicione os atributos de acordo com o campo
            </h6>
          </v-card-text>
          <v-divider></v-divider>
          <v-card-text>
            <v-text-field
              type="email"
              v-model="form.email"
              label="Email"
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
              >Login</v-btn
            >
            <p class="login-card-footer-text">
              Não tem uma conta ?
              <a href="/cadastro" class="text-reset">Registre-se aqui</a>
            </p>
          </v-card-text>
        </form>
      </v-card>
    </v-container>
  </dir>
 
</template>

<script>
import { mapActions } from "vuex";
import * as actionsTypes from "../../controller/store/actions-types";
export default {
  name: "Login",
  data: () => ({
    form: {
      email: "",
      senha: "",
    },
  }),
  methods: {
    ...mapActions([actionsTypes.ActionDoLogin]),
    async submit() {
      try {
        console.log(this.form);
        await this.ActionDoLogin(this.form);
        this.$router.push({ name: "Home" });
      } catch (err) {
        alert(err.data ? err.data.message : "Não foi possível fazer login");
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