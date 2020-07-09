package org.fasttrackit.persistance;

public interface RankingRepository {
    void addRankingItem(int rank,String competitorName,double totalDistance);
    void close();
}
