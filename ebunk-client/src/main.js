import Vue from 'vue'
import App from './App.vue'
import './registerServiceWorker'
import router from './router'
import vuetify from './plugins/vuetify';
import VueFormGenerator from 'vue-form-generator'
import 'vue-form-generator/dist/vfg.css'
Vue.use(VueFormGenerator);

import 'material-design-icons-iconfont/dist/material-design-icons.css'


Vue.config.productionTip = false

new Vue({
  router,
  vuetify,
  VueFormGenerator,
  render: h => h(App)
}).$mount('#app')
