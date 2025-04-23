import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import bumenzhuguan from '@/views/modules/bumenzhuguan/list'
    import yuangong from '@/views/modules/yuangong/list'
    import peixunkecheng from '@/views/modules/peixunkecheng/list'
    import peixunjihua from '@/views/modules/peixunjihua/list'
    import peixunxuqiu from '@/views/modules/peixunxuqiu/list'
    import bumen from '@/views/modules/bumen/list'
    import peixunziyuan from '@/views/modules/peixunziyuan/list'
    import peixunhuodong from '@/views/modules/peixunhuodong/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/bumenzhuguan',
        name: '部门主管',
        component: bumenzhuguan
      }
      ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
      ,{
	path: '/peixunkecheng',
        name: '培训课程',
        component: peixunkecheng
      }
      ,{
	path: '/peixunjihua',
        name: '培训计划',
        component: peixunjihua
      }
      ,{
	path: '/peixunxuqiu',
        name: '培训需求',
        component: peixunxuqiu
      }
      ,{
	path: '/bumen',
        name: '部门',
        component: bumen
      }
      ,{
	path: '/peixunziyuan',
        name: '培训资源',
        component: peixunziyuan
      }
      ,{
	path: '/peixunhuodong',
        name: '培训活动',
        component: peixunhuodong
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
