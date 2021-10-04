package banking.tax;


import banking.tax.dao.TaxRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaxApplication implements CommandLineRunner {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TaxRepository taxRepository;

    public static void main(String[] args) {
        SpringApplication.run(TaxApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        logger.info("taxes -> {}", taxRepository.save(new Tax(123, OperationType.CREATE_ACCOUNT,
//                TaxType.FIX_AMOUNT, 1235.00 )));

    }
}
