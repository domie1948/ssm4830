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
    import gongyingshang from '@/views/modules/gongyingshang/list'
    import yonghu from '@/views/modules/yonghu/list'
    import shengxianxinxi from '@/views/modules/shengxianxinxi/list'
    import chat from '@/views/modules/chat/list'
    import discussshengxianxinxi from '@/views/modules/discussshengxianxinxi/list'
    import shengxianjinhuo from '@/views/modules/shengxianjinhuo/list'
    import discussshengxianzhanshi from '@/views/modules/discussshengxianzhanshi/list'
    import shengxianzhanshi from '@/views/modules/shengxianzhanshi/list'
    import storeup from '@/views/modules/storeup/list'
    import config from '@/views/modules/config/list'
    import shangjia from '@/views/modules/shangjia/list'
    import goumaixinxi from '@/views/modules/goumaixinxi/list'


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
	path: '/gongyingshang',
        name: '供应商',
        component: gongyingshang
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/shengxianxinxi',
        name: '生鲜信息',
        component: shengxianxinxi
      }
          ,{
	path: '/chat',
        name: '客服管理',
        component: chat
      }
          ,{
	path: '/discussshengxianxinxi',
        name: '生鲜信息评论',
        component: discussshengxianxinxi
      }
          ,{
	path: '/shengxianjinhuo',
        name: '生鲜进货',
        component: shengxianjinhuo
      }
          ,{
	path: '/discussshengxianzhanshi',
        name: '生鲜展示评论',
        component: discussshengxianzhanshi
      }
          ,{
	path: '/shengxianzhanshi',
        name: '生鲜展示',
        component: shengxianzhanshi
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/shangjia',
        name: '商家',
        component: shangjia
      }
          ,{
	path: '/goumaixinxi',
        name: '购买信息',
        component: goumaixinxi
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
