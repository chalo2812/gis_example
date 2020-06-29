<template>
  <div class="home">
    <img alt="Vue logo"
      src="../assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js App"></HelloWorld>
    <h2>
      <b-button variant="primary">
        Algo
      </b-button>
    </h2>
  </div>
</template>

<script>
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'Home',
  components: {
    HelloWorld
  }
}
</script>
