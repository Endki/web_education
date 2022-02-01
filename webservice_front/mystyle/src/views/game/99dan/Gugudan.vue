<template>
  <div class="col-md-9 at-col at-main">
    <h4>{{ first }}곱하기 {{ second }}는?</h4>
    <b-form @submit.prevent="onSubmitForm">
      <input type="number" ref="answer" v-model="value" />
      <b-button type="submit">입력</b-button>
    </b-form>
    <h4 id="result">{{ result }}</h4>
    <h4 id="point">점수 : {{ point }}</h4>
  </div>
</template>
<script>
export default {
  data() {
    return {
      first: Math.ceil(Math.random() * 9),
      second: Math.ceil(Math.random() * 9),
      value: '',
      result: '',
      point: 0,
    };
  },
  methods: {
    onSubmitForm(e) {
      e.preventDefault();
      if (this.first * this.second === parseInt(this.value)) {
        this.result = '정답';
        this.first = Math.ceil(Math.random() * 9);
        this.second = Math.ceil(Math.random() * 9);
        this.value = '';
        this.point = parseInt(this.point) + 100;
        this.$refs.answer.focus();
      } else {
        this.result = '땡';
        this.value = '';
        this.point = parseInt(this.point) - 10;
        this.$refs.answer.focus();
      }
    },
  },
};
</script>
