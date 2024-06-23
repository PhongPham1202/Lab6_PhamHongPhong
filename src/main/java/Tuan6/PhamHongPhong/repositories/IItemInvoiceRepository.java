package Tuan6.PhamHongPhong.repositories;
import Tuan6.PhamHongPhong.entities.ItemInvoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IItemInvoiceRepository extends
        JpaRepository<ItemInvoice, Long>{
}