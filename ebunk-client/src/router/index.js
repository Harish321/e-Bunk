import Vue from 'vue'
import VueRouter from 'vue-router'
import Dashboard from '../views/Dashboard.vue'
import Collection from '../views/Collection.vue'
import Unload from '../views/Unload.vue'


Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Dashboard',
    component: Dashboard
  },
  {
    path: '/Collection',
    name: 'Collection',
    component: Collection
  },
  {
    path: '/Unload',
    name: 'Unload',
    component: Unload
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
