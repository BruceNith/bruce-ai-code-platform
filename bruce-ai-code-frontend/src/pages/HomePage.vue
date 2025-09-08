<script setup lang="ts">
import { useLoginUserStore } from '@/stores/loginUser.ts'
const loginUserStore = useLoginUserStore()
</script>

<template>
  <main>
    <div class="welcome">
      <h1>欢迎使用 AI 应用生成系统</h1>
      <p>当前用户: {{ loginUserStore.loginUser.userName }}</p>
    </div>
  </main>
</template>

<style scoped>
.welcome {
  text-align: center;
  padding: 40px 20px;
}

.welcome h1 {
  font-size: 2rem;
  margin-bottom: 20px;
  color: #1890ff;
}

.welcome p {
  font-size: 1.2rem;
  color: #666;
}
</style>