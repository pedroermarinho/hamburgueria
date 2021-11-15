<template>
  <v-footer light height="300px">
    <v-container>
      <v-col>
        <v-row>
          <v-col>
            <v-card-text> news, offers and more </v-card-text>
          </v-col>
          <v-col>
            <v-img
              src="./../../assets/images/Grupo de máscara 8.png"
              max-width="200"
            ></v-img>
          </v-col>
          <v-spacer></v-spacer>
          <v-col>
            <v-card-text> exclusive offers for you </v-card-text>
          </v-col>
          <v-col >
            <v-text-field solo></v-text-field>
          </v-col>
        </v-row>

        <v-row>
          <v-col>
            <v-card-text>payment methods</v-card-text>
            <v-img
              src="./../../assets/images/9d2ef9fbe6e952184a11ee452f3d1c49.png"
              max-width="200"
            ></v-img>
          </v-col>
          <v-spacer />
          <v-col md="2">
            <v-img
              src="./../../assets/images/site-blindado-logo.png"
              max-width="200"
            ></v-img>
          </v-col>
          <v-col md="2">
            <v-img
              src="./../../assets/images/SITE-SEGURO.png"
              max-width="200"
            ></v-img>
          </v-col>
        </v-row>

        <v-card-text class="text-center">
          Company Name / CNPJ: 00000000/0000-00/ State Registration:
          000.000.000.000 / Address: Street Name, Number - State - 00000-000
          <br />
          customer service@empresa.com - Site Map
        </v-card-text>
      </v-col>
    </v-container>
  </v-footer>
</template>

<script>
export default {
  name: "Footer",
};
</script>