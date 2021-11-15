<template>
  <v-app  >
   <v-main>
     <v-container >
       <router-view  />
     </v-container>
    
   </v-main>
    <Footer/>
  </v-app>
</template>


<style>
.main{
background: transparent linear-gradient(134deg, #473400 0%, #232227 21%, #232227 100%) 0% 0% no-repeat padding-box;
}
.container{
     max-width: 100vw;
     padding:0px;
  }
</style>

<script>
import Footer from './view/components/Footer.vue';
import store from './controller/store';

try {
  store.dispatch('ActionCheckToken');
} catch (error) {
  console.log(error);
}


export default {
  name: 'App',

  components: {
    Footer
  },
  data: () => ({
    //
  }),

  methods:{
  }
};
</script>
