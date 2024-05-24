//package com.example.demo.service;
//
//import com.example.demo.entity.Post;
////import com.mongodb.client.AggregateIterable;
////import com.mongodb.client.MongoClient;
////import com.mongodb.client.MongoCollection;
////import com.mongodb.client.MongoDatabase;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.data.mongodb.core.convert.MongoConverter;
////import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class JobServiceImp implements JobService {
//
//    @Autowired
//    MongoClient client;
//
//    @Autowired
//    MongoConverter converter;
//
//    public List<Post> findByText(String text) {
//
//        final List<Post> posts = new ArrayList<>();
//
//        MongoDatabase database = client.getDatabase("telusko");
//        MongoCollection<org.bson.Document> collection = database.getCollection("JobPost");
//
//        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
//                                new Document("text",
//                                new Document("query", text)
//                                        .append("path", Arrays.asList("techs", "desc", "profile")))),
//                new Document("$sort",
//                        new Document("exp", 1L)),
//                new Document("$limit", 5L)));
//
//        result.forEach(doc -> posts.add(converter.read(Post.class,doc)));
//
//        return posts;
//    }
//}
