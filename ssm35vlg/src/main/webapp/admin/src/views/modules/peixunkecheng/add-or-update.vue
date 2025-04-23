<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row >
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'" label="培训课程" prop="peixunkecheng">
          <el-select :disabled="ro.peixunkecheng" @change="peixunkechengChange" v-model="ruleForm.peixunkecheng" placeholder="请选择培训课程">
            <el-option
                v-for="(item,index) in peixunkechengOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input"v-if="ruleForm.peixunkecheng" label="培训课程" prop="peixunkecheng">
              <el-input v-model="ruleForm.peixunkecheng" 
                placeholder="培训课程" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="培训教师" prop="peixunjiaoshi">
          <el-input v-model="ruleForm.peixunjiaoshi" 
              placeholder="培训教师" clearable  :readonly="ro.peixunjiaoshi"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="培训教师" prop="peixunjiaoshi">
              <el-input v-model="ruleForm.peixunjiaoshi" 
                placeholder="培训教师" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="培训机构" prop="peixunjigou">
          <el-input v-model="ruleForm.peixunjigou" 
              placeholder="培训机构" clearable  :readonly="ro.peixunjigou"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="培训机构" prop="peixunjigou">
              <el-input v-model="ruleForm.peixunjigou" 
                placeholder="培训机构" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="课程地点" prop="kechengdidian">
          <el-input v-model="ruleForm.kechengdidian" 
              placeholder="课程地点" clearable  :readonly="ro.kechengdidian"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="课程地点" prop="kechengdidian">
              <el-input v-model="ruleForm.kechengdidian" 
                placeholder="课程地点" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="课程时间" prop="kechengshijian">
          <el-input v-model="ruleForm.kechengshijian" 
              placeholder="课程时间" clearable  :readonly="ro.kechengshijian"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="课程时间" prop="kechengshijian">
              <el-input v-model="ruleForm.kechengshijian" 
                placeholder="课程时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="学时" prop="xueshi">
          <el-input v-model="ruleForm.xueshi" 
              placeholder="学时" clearable  :readonly="ro.xueshi"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="学时" prop="xueshi">
              <el-input v-model="ruleForm.xueshi" 
                placeholder="学时" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="活动名称" prop="huodongmingcheng">
          <el-input v-model="ruleForm.huodongmingcheng" 
              placeholder="活动名称" clearable  :readonly="ro.huodongmingcheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="活动名称" prop="huodongmingcheng">
              <el-input v-model="ruleForm.huodongmingcheng" 
                placeholder="活动名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="员工工号" prop="yuangonggonghao">
          <el-input v-model="ruleForm.yuangonggonghao" 
              placeholder="员工工号" clearable  :readonly="ro.yuangonggonghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="员工工号" prop="yuangonggonghao">
              <el-input v-model="ruleForm.yuangonggonghao" 
                placeholder="员工工号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="员工姓名" prop="yuangongxingming">
          <el-input v-model="ruleForm.yuangongxingming" 
              placeholder="员工姓名" clearable  :readonly="ro.yuangongxingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="员工姓名" prop="yuangongxingming">
              <el-input v-model="ruleForm.yuangongxingming" 
                placeholder="员工姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="部门" prop="bumen">
          <el-input v-model="ruleForm.bumen" 
              placeholder="部门" clearable  :readonly="ro.bumen"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="部门" prop="bumen">
              <el-input v-model="ruleForm.bumen" 
                placeholder="部门" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="员工手机" prop="yuangongshouji">
          <el-input v-model="ruleForm.yuangongshouji" 
              placeholder="员工手机" clearable  :readonly="ro.yuangongshouji"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="员工手机" prop="yuangongshouji">
              <el-input v-model="ruleForm.yuangongshouji" 
                placeholder="员工手机" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="主管账号" prop="zhuguanzhanghao">
          <el-input v-model="ruleForm.zhuguanzhanghao" 
              placeholder="主管账号" clearable  :readonly="ro.zhuguanzhanghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="主管账号" prop="zhuguanzhanghao">
              <el-input v-model="ruleForm.zhuguanzhanghao" 
                placeholder="主管账号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="主管姓名" prop="zhuguanxingming">
          <el-input v-model="ruleForm.zhuguanxingming" 
              placeholder="主管姓名" clearable  :readonly="ro.zhuguanxingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="主管姓名" prop="zhuguanxingming">
              <el-input v-model="ruleForm.zhuguanxingming" 
                placeholder="主管姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      </el-row>
      <el-form-item class="btn">
        <el-button  v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"#fff","selectFontSize":"14px","btnCancelBorderColor":"rgba(245, 182, 27, 1)","inputBorderRadius":"30px","inputFontSize":"14px","textareaBgColor":"#fff","btnSaveFontSize":"14px","textareaBorderRadius":"30px","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"30px 0 30px 0","uploadLableFontSize":"14px","textareaBorderWidth":"4px","inputLableColor":"rgba(245, 182, 27, 1)","addEditBoxColor":"rgba(255, 255, 255, 0)","dateIconFontSize":"14px","btnSaveBgColor":"rgba(245, 182, 27, 1)","uploadIconFontColor":"rgba(245, 182, 27, 1)","textareaBorderColor":"rgba(245, 182, 27, 1)","btnCancelBgColor":"rgba(255, 255, 255, 1)","selectLableColor":"rgba(245, 182, 27, 1)","btnSaveBorderStyle":"solid","dateBorderWidth":"4px","dateLableFontSize":"14px","dateBorderRadius":"30px","btnCancelBorderStyle":"solid","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"#C0C4CC","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"rgba(245, 182, 27, 1)","dateBorderColor":"rgba(245, 182, 27, 1)","dateIconFontColor":"rgba(245, 182, 27, 1)","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"rgba(245, 182, 27, 1)","dateFontSize":"14px","inputBorderWidth":"4px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"#606266","uploadHeight":"148px","textareaLableColor":"rgba(245, 182, 27, 1)","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"30px 0 30px 0","inputBgColor":"#fff","inputLableFontSize":"14px","uploadLableColor":"rgba(245, 182, 27, 1)","uploadBorderRadius":"30px","btnSaveHeight":"44px","selectBgColor":"#fff","btnSaveWidth":"88px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"rgba(245, 182, 27, 1)","inputBorderColor":"rgba(245, 182, 27, 1)","uploadBorderColor":"rgba(245, 182, 27, 1)","textareaFontColor":"#606266","selectBorderWidth":"4px","dateFontColor":"rgba(64, 64, 64, 1)","btnCancelBorderWidth":"5px","uploadBorderWidth":"4px","textareaFontSize":"14px","selectBorderRadius":"30px","selectFontColor":"#606266","btnSaveBorderColor":"rgba(255, 255, 255, 1)","btnSaveBorderWidth":"5px"},
      id: '',
      type: '',
      ro:{
	peixunkecheng : false,
	peixunjiaoshi : false,
	peixunjigou : false,
	kechengdidian : false,
	kechengshijian : false,
	xueshi : false,
	huodongmingcheng : false,
	yuangonggonghao : false,
	yuangongxingming : false,
	bumen : false,
	yuangongshouji : false,
	zhuguanzhanghao : false,
	zhuguanxingming : false,
      },
      ruleForm: {
        peixunkecheng: '',
        peixunjiaoshi: '',
        peixunjigou: '',
        kechengdidian: '',
        kechengshijian: '',
        xueshi: '',
        huodongmingcheng: '',
        yuangonggonghao: '',
        yuangongxingming: '',
        bumen: '',
        yuangongshouji: '',
        zhuguanzhanghao: '',
        zhuguanxingming: '',
      },
          peixunkechengOptions: [],
      rules: {
          peixunkecheng: [
                { required: true, message: '培训课程不能为空', trigger: 'blur' },
          ],
          peixunjiaoshi: [
          ],
          peixunjigou: [
          ],
          kechengdidian: [
                { required: true, message: '课程地点不能为空', trigger: 'blur' },
          ],
          kechengshijian: [
                { required: true, message: '课程时间不能为空', trigger: 'blur' },
          ],
          xueshi: [
                { required: true, message: '学时不能为空', trigger: 'blur' },
          ],
          huodongmingcheng: [
          ],
          yuangonggonghao: [
          ],
          yuangongxingming: [
          ],
          bumen: [
          ],
          yuangongshouji: [
          ],
          zhuguanzhanghao: [
          ],
          zhuguanxingming: [
          ],
      }
    };
  },
  props: ["parent"],
  computed: {



  },
  created() {
	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
    // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='logistics'){
        this.logistics=false;
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          if(o=='peixunkecheng'){
            this.ruleForm.peixunkecheng = obj[o];
	    this.ro.peixunkecheng = true;
            continue;
          }
          if(o=='peixunjiaoshi'){
            this.ruleForm.peixunjiaoshi = obj[o];
	    this.ro.peixunjiaoshi = true;
            continue;
          }
          if(o=='peixunjigou'){
            this.ruleForm.peixunjigou = obj[o];
	    this.ro.peixunjigou = true;
            continue;
          }
          if(o=='kechengdidian'){
            this.ruleForm.kechengdidian = obj[o];
	    this.ro.kechengdidian = true;
            continue;
          }
          if(o=='kechengshijian'){
            this.ruleForm.kechengshijian = obj[o];
	    this.ro.kechengshijian = true;
            continue;
          }
          if(o=='xueshi'){
            this.ruleForm.xueshi = obj[o];
	    this.ro.xueshi = true;
            continue;
          }
          if(o=='huodongmingcheng'){
            this.ruleForm.huodongmingcheng = obj[o];
	    this.ro.huodongmingcheng = true;
            continue;
          }
          if(o=='yuangonggonghao'){
            this.ruleForm.yuangonggonghao = obj[o];
	    this.ro.yuangonggonghao = true;
            continue;
          }
          if(o=='yuangongxingming'){
            this.ruleForm.yuangongxingming = obj[o];
	    this.ro.yuangongxingming = true;
            continue;
          }
          if(o=='bumen'){
            this.ruleForm.bumen = obj[o];
	    this.ro.bumen = true;
            continue;
          }
          if(o=='yuangongshouji'){
            this.ruleForm.yuangongshouji = obj[o];
	    this.ro.yuangongshouji = true;
            continue;
          }
          if(o=='zhuguanzhanghao'){
            this.ruleForm.zhuguanzhanghao = obj[o];
	    this.ro.zhuguanzhanghao = true;
            continue;
          }
          if(o=='zhuguanxingming'){
            this.ruleForm.zhuguanxingming = obj[o];
	    this.ro.zhuguanxingming = true;
            continue;
          }
        }
      }
      // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
        } else {
          this.$message.error(data.msg);
        }
      });
            this.$http({
              url: `option/peixunziyuan/peixunkecheng`,
              method: "get"
            }).then(({ data }) => {
              if (data && data.code === 0) {
                this.peixunkechengOptions = data.data;
              } else {
                this.$message.error(data.msg);
              }
            });
    },
    // 下二随
    peixunkechengChange () {
      this.$http({
        url: `follow/peixunziyuan/peixunkecheng?columnValue=`+ this.ruleForm.peixunkecheng,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
              if(data.data.peixunjiaoshi){
                this.ruleForm.peixunjiaoshi = data.data.peixunjiaoshi
              }
              if(data.data.peixunjigou){
                this.ruleForm.peixunjigou = data.data.peixunjigou
              }
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 多级联动参数
    info(id) {
      this.$http({
        url: `peixunkecheng/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传图片后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {



























var objcross = this.$storage.getObj('crossObj');

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(!statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "peixunkecheng/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `peixunkecheng/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.peixunkechengCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `peixunkecheng/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.peixunkechengCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
			   }
			 });
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.peixunkechengCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
	background-color: transparent;
}
.btn .el-button {
  padding: 0;
}
</style>
