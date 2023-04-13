<script setup>
import Article from './components/Article.vue'
import Front from './components/Front.vue'
import TheWelcome from './components/TheWelcome.vue'
</script>

<template>
  <header>

    <div class="wrapper">
      <Article title="Docker-project" content="Skriv noget til vores artikel-samling!" />
    </div>
  </header>

  <main>
    <Front title="Titel" content="Virkelig meget indhold med meget tekst og så videre, således at man kan vurdere nogle størrelser." />
  </main>
</template>

<style scoped>
header {
  line-height: 1.5;
}

.logo {
  display: block;
  margin: 0 auto 2rem;
}

@media (min-width: 1024px) {
  /*header {
    display: flex;
    place-items: center;
    padding-right: calc(var(--section-gap) / 2);
  }

  .logo {
    margin: 0 2rem 0 0;
  }

  header .wrapper {
    display: flex;
    place-items: flex-start;
    flex-wrap: wrap;
  }*/
}
</style>
