<script setup>
import Article from './Article.vue'
import InputArticle from './InputArticle.vue';
defineProps({
  title: {
    type: String,
    required: true
  },
  content: {
    type: String,
    required: true
  }
})
</script>

<template>
  <div class="half">
  <InputArticle />
  </div>
  <div class="half">
  <Article title="Title" content="arkfjekrjnrjng kajnrgkenjrg nkjnkjnergaerg  eropgpokae" />
  </div>
</template>

<style scoped>
h1 {
  font-weight: 500;
  font-size: 2.6rem;
  top: -10px;
}

h3 {
  font-size: 1.2rem;
}

.half {
  margin: 0 0 0 2%;
  width: 48%;
  display: inline-block;
}

@media (min-width: 1024px) {
  .greetings h1,
  .greetings h3 {
    text-align: left;
  }
}
</style>
