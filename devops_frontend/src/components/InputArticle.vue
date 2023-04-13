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
function submitArticle() {
  alert("h");
  
}
</script>

<template>
  <div class="article">
    <p>
      Title<br>
      <input id="inputTitle" type="text" size="30" /><br>
      Content<br>
      <textarea id="inputContent" /><br>
      <input id="submitbtn" type="submit" @click="submitArticle()">
    </p>
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
