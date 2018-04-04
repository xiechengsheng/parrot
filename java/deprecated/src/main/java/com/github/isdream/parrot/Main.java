package com.github.isdream.parrot;

import java.util.List;

import com.github.isdream.parrot.algorithm.DefaultScheduling;
import com.github.isdream.parrot.entities.Cluster;
import com.github.isdream.parrot.entities.Pod;
import com.github.isdream.parrot.utils.CSVOperation;

/**
 * @Author Shijun Qin qinshijun2016@otcaix.iscas.ac.cn
 * @Date 2018/2/28 18:54
 */
public class Main {
    public static void main(String[] args) {
        List<Pod> podList = CSVOperation.readInfo();

        Cluster cluster = new Cluster(1300, 64, 1.0);
        DefaultScheduling.schedule(cluster, podList);

        CSVOperation.writeInfo(cluster, podList);
    }
}
