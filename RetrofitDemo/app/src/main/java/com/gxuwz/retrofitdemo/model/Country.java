package com.gxuwz.retrofitdemo.model;

import java.util.List;

/**
 * Created by FR on 2016/7/28.
 */
public class Country {

    /**
     * data : [{"id":"5613","title":"茶百科androidV1.2新功能简介","name":"茶百科androidV1.2新功能简介","link":"http://sns.maimaicha.com/news/detail/5613","content":"1、\t更新页面布局，增加首次登陆提示页。\r\n2、\t增加栏目导航，按照分类列表展示。","image":"http://s1.sns.maimaicha.com/images/2013/04/18/b0a9fed6aaef278fb5061b194c63d088.jpg","image_s":"http://s1.sns.maimaicha.com/images/2013/04/18/9866411d3f679484822a286d58975956.jpg"},{"id":"5697","title":"雅安茶\u201d旺季被腰斩 茶企建\u201c爱心茶园\u201d解困","name":"雅安茶\u201d旺季被腰斩 茶企建\u201c爱心茶园\u201d解困","link":"http://sns.maimaicha.com/news/detail/5697","content":"雅安，一个在地震中被全国关注的城市。它是茶马古道的起源地，是世界上人工种茶最早的地方，有着深厚的茶文化底蕴。","image":"http://s1.sns.maimaicha.com/images/2013/05/07/b3a779ef8943792e4ed1bdf27c9efba6.jpg","image_s":"http://s1.sns.maimaicha.com/images/2013/05/07/6d60139a8689e455db1cd7d8b4b4461a.jpg"},{"id":"","title":"意境和遐思 茶席不可或缺的竹制品","name":"意境和遐思 茶席不可或缺的竹制品","link":"http://sns.maimaicha.com/news/detail/5695","content":"与茶相关的竹制品有很多，大至茶盘、茶席，小至茶则、茶针。虽然喝茶不一定必须要配茶盘、布置茶席，而即便配茶盘、茶席，也不一定就要选用竹制的茶盘、茶席，但那些竹制的茶器具，带给大家的是更多的意境和遐思。","image":"http://s1.sns.maimaicha.com/images/2013/05/07/961336c29325d15a3c98caae5b431728.jpg","image_s":"http://s1.sns.maimaicha.com/images/2013/05/07/a875dafaf30d9baf31424274b7f544cf.jpg"}]
     * errorMessage : success
     */

    private String errorMessage;
    /**
     * id : 5613
     * title : 茶百科androidV1.2新功能简介
     * name : 茶百科androidV1.2新功能简介
     * link : http://sns.maimaicha.com/news/detail/5613
     * content : 1、	更新页面布局，增加首次登陆提示页。
     2、	增加栏目导航，按照分类列表展示。
     * image : http://s1.sns.maimaicha.com/images/2013/04/18/b0a9fed6aaef278fb5061b194c63d088.jpg
     * image_s : http://s1.sns.maimaicha.com/images/2013/04/18/9866411d3f679484822a286d58975956.jpg
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
        private String name;
        private String link;
        private String content;
        private String image;
        private String image_s;

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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getImage_s() {
            return image_s;
        }

        public void setImage_s(String image_s) {
            this.image_s = image_s;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "id='" + id + '\'' +
                    ", title='" + title + '\'' +
                    ", name='" + name + '\'' +
                    ", link='" + link + '\'' +
                    ", content='" + content + '\'' +
                    ", image='" + image + '\'' +
                    ", image_s='" + image_s + '\'' +
                    '}';
        }
    }
}
