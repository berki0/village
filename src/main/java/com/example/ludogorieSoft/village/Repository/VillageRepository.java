package com.example.ludogorieSoft.village.Repository;
import com.example.ludogorieSoft.village.Model.Village;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VillageRepository extends JpaRepository<Village, Long> {
}
