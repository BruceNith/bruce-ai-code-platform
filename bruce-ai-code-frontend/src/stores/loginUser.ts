import { defineStore } from 'pinia'
import { ref } from 'vue'
import { getLoginUser } from '@/api/userController.ts'

/**
 * 登录用户信息
 */
export const useLoginUserStore = defineStore('loginUser', () => {
  // 默认值
  const loginUser = ref<API.LoginUserVO>({
    userName: '未登录',
  })

  // 获取登录用户信息
  async function fetchLoginUser() {
    try {
      const res = await getLoginUser()
      console.log('用户信息:', res.data )
      if (res.data.code === 0 && res.data.data) {
        console.log('成功获取用户信息:', res.data.data)
        loginUser.value = res.data.data
      } else {
        console.warn('获取用户信息失败，使用默认状态')
        loginUser.value = {
          userName: '未登录',
        }
      }
    } catch (error) {
      console.error('获取用户信息失败:', error)
      loginUser.value = {
        userName: '未登录',
      }
    }
  }

  // 更新登录用户信息
  function setLoginUser(newLoginUser: any) {
    loginUser.value = newLoginUser
  }

  return { loginUser, fetchLoginUser, setLoginUser }
})
