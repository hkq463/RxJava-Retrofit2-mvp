package com.gxuwz.retrofitdemo.model;

import java.util.List;

/**
 * Created by FR on 2016/8/1.
 */
public class MsgList {

    /**
     * data : [{"id":"5614","title":"我国首个茶行业专属场景化经营管理信息系统投入试点应用","source":"买买茶","description":"我国首个专为茶行业商业信息化提升服务的茶店管理系统平台\u2014\u2014买买茶店铺云管理系统今年4月份正式投入试点运行。该系统由华夏茶","wap_thumb":"http://s1.sns.maimaicha.com/images/2013/04/16/20130416103336_62277_suolue3.jpg","create_time":"04月16日10:30","nickname":"儒商"},{"id":"5468","title":"茶马古道：我国最早的茶叶贸易通道","source":"买买茶","description":"对于我国的对外贸易通道，众所周知丝绸之路有两条，一是通过我国西北到达欧洲的丝绸之路；另一条则是起源于我国南方，经过海路到","wap_thumb":"","create_time":"03月28日16:44","nickname":"teacops"},{"id":"5395","title":"我信赖的一款产品\u2014\u2014\u2014 济南百姓口碑榜 御青茶叶榜上有名","source":"买买茶","description":"金杯银杯，不如老百姓的口碑！\u201d在3·15国际消费者权益日到来之际，济南日报市民记者团推出\u201c我信赖的一款产品\u2014\u2014\u2014 济南百","wap_thumb":"","create_time":"03月16日09:53","nickname":"时间会苍白"},{"id":"5379","title":"我国古代茶具的发展简史","source":"买买茶","description":"我国古代茶具的发展简史","wap_thumb":"","create_time":"02月13日14:13","nickname":"苏demo"},{"id":"5316","title":"我国茶具种类大致有几种","source":"买买茶","description":"我国茶具种类大致有几种","wap_thumb":"","create_time":"11月18日13:31","nickname":"苏demo"},{"id":"5273","title":"我国茶叶的分类简介","source":"买买茶","description":"我国茶叶的分类简介","wap_thumb":"","create_time":"10月31日13:37","nickname":"苏demo"},{"id":"5211","title":"我国名茶的茶区分布","source":"买买茶","description":"我国名茶的茶区分布","wap_thumb":"","create_time":"10月14日15:41","nickname":"苏demo"},{"id":"5201","title":"我国民间敬茶礼仪有讲究","source":"买买茶","description":"我国民间敬茶礼仪有讲究","wap_thumb":"","create_time":"10月13日13:42","nickname":"苏demo"},{"id":"5194","title":"我国饮茶风俗各有不同 大致可分四类","source":"买买茶","description":"我国饮茶风俗各有不同 大致可分四类","wap_thumb":"","create_time":"10月12日12:16","nickname":"苏demo"},{"id":"5092","title":"我国茶叶分哪些种类？各有什么特色","source":"买买茶","description":"我国茶叶分哪些种类？各有什么特色","wap_thumb":"","create_time":"09月19日12:45","nickname":"苏demo"}]
     * errorMessage : success
     */

    private String errorMessage;
    /**
     * id : 5614
     * title : 我国首个茶行业专属场景化经营管理信息系统投入试点应用
     * source : 买买茶
     * description : 我国首个专为茶行业商业信息化提升服务的茶店管理系统平台——买买茶店铺云管理系统今年4月份正式投入试点运行。该系统由华夏茶
     * wap_thumb : http://s1.sns.maimaicha.com/images/2013/04/16/20130416103336_62277_suolue3.jpg
     * create_time : 04月16日10:30
     * nickname : 儒商
     */

    private List<DataBean> data;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String id;
        private String title;
        private String source;
        private String description;
        private String wap_thumb;
        private String create_time;
        private String nickname;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getWap_thumb() {
            return wap_thumb;
        }

        public void setWap_thumb(String wap_thumb) {
            this.wap_thumb = wap_thumb;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "id='" + id + '\'' +
                    ", title='" + title + '\'' +
                    ", source='" + source + '\'' +
                    ", description='" + description + '\'' +
                    ", wap_thumb='" + wap_thumb + '\'' +
                    ", create_time='" + create_time + '\'' +
                    ", nickname='" + nickname + '\'' +
                    '}';
        }
    }
}
