package Tuan6.PhamHongPhong.repositories;


import Tuan6.PhamHongPhong.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category,Long> {
}
