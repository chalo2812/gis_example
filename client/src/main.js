import Vue from 'vue'
import Vuex from 'vuex'
import BootstrapVue from 'bootstrap-vue'
import App from './App.vue'
import './registerServiceWorker'

Vue.config.productionTip = false
Vue.use(BootstrapVue)
Vue.component(Vuex)


new Vue({
  render: h => h(App),
}).$mount('#app')
