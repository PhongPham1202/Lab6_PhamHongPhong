package Tuan6.PhamHongPhong.repositories;
import Tuan6.PhamHongPhong.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IInvoiceRepository extends JpaRepository<Invoice,
        Long>{
}