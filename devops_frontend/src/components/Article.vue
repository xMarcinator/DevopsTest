<script setup>
defineProps({
  title: {
    type: String,
    required: true
  },
  content: {
    type: String,
    required : true
  }
})
</script>

<template>
  <div class="article">
    <h1>{{ title }}</h1>
    <p>{{  content }}</p>
  </div>
</template>

<style scoped>
h1 {
  font-weight: 500;
  font-size: 2.6rem;
}
.article {
  max-width: 500px;
}


@media (min-width: 1024px) {
}
</style>
