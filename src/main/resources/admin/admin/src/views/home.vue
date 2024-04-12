<template>
<div class="content">
			<div class="text main-text" :style='{"padding":"20px 100px","boxShadow":"0 0 0px rgba(0,0,0,.1)","margin":"13% auto 0","borderColor":"rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","color":"rgba(111, 111, 151, 1)","borderRadius":"40px","borderWidth":"0","width":"auto","lineHeight":"auto","fontSize":"50px","borderStyle":"solid"}'>欢迎使用 {{this.$project.projectName}}</div>
	</div>
</template>
<script>
import router from '@/router/router-static'
export default {
	data() {
		return {
			
		};
	},
  mounted(){
    this.init();
  },
  methods:{
    init(){
        if(this.$storage.get('Token')){
        this.$http({
            url: `${this.$storage.get('sessionTable')}/session`,
            method: "get"
        }).then(({ data }) => {
            if (data && data.code != 0) {
            router.push({ name: 'login' })
            }
        });
        }else{
            router.push({ name: 'login' })
        }
    }
  }
};
</script>

<style lang="scss" scoped>
.content {
  display: flex;
  align-items: center;
  flex-direction: column;
  width: 100%;
  height: 100%;
  min-height: 500px;
  text-align: center;
  background: transparent;
  .main-text{
    font-size: 38px;
    font-weight: bold;
    margin-top: 15%;
  }
  .text {
    font-size: 24px;
    font-weight: bold;
    color: #333;
  }
}
</style>