package com.yjf.ela.controller;

import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.text.Text;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Title: ela
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/12 14:53
 */
@RestController
public class ela {
    @Autowired
    private RestHighLevelClient client;

    @ResponseBody
    @GetMapping("/getinfo/{keyword}")
    public List hello(@PathVariable String keyword) throws IOException{
        System.out.println("begin---");
        return test10(keyword);
    }


    List test10(String keyword) throws IOException {
        //1.构建检索条件
        SearchRequest searchRequest = new SearchRequest();
        //2.指定要检索的索引库
        searchRequest.indices("yjf");
        //3.指定检索条件
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        sourceBuilder.timeout(new TimeValue(60, TimeUnit.SECONDS));
        sourceBuilder.query(QueryBuilders.matchQuery(keyword, "name"));

        //4.结果高亮
        HighlightBuilder highlightBuilder = new HighlightBuilder();
        highlightBuilder.requireFieldMatch(true); //如果该属性中有多个关键字 则都高亮
        highlightBuilder.field("name");
        highlightBuilder.preTags("<span style='color:red'>");
        highlightBuilder.postTags("</span>");

        sourceBuilder.highlighter(highlightBuilder);
        searchRequest.source(sourceBuilder);
        SearchResponse response = client.search(searchRequest, RequestOptions.DEFAULT.toBuilder().build());
        SearchHit[] hits = response.getHits().getHits();
        List<Map<String, Object>> list = new ArrayList<>();
        for (SearchHit hit : response.getHits().getHits()) {
            Map<String, Object> sourceAsMap = hit.getSourceAsMap();
            //解析高亮字段
            Text[] fragments = hit.getHighlightFields().get("name").fragments();
            String n_field = "";
            for (Text fragment : fragments) {
                n_field += fragment;
            }
            //高亮标题覆盖原标题
            sourceAsMap.put("name", n_field);
            list.add(sourceAsMap);
        }
        return list;
    }


}
