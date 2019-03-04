import Vue from 'vue'
import App from './App.vue'
import router from './router'
import axios from 'axios'
import VueAxios from 'vue-axios'

Vue.use(VueAxios, axios); // axios는 플러그인이기때문에 이와같이 추가해준다.
Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
