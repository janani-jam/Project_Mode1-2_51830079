package com.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.Customer;
import com.bankapp.model.entities.AppUser;
import com.bankapp.model.repo.AccountRepository;
import com.bankapp.model.repo.AccountTransactionRepository;
import com.bankapp.model.repo.CustomerRepository;
import com.bankapp.model.repo.TransactionLogRepository;
import com.bankapp.model.repo.UserRepository;
import com.bankapp.model.service.AccountService;
@EnableTransactionManagement
@SpringBootApplication
public class BankappV1Application implements CommandLineRunner {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private AccountTransactionRepository accountTransactionRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private TransactionLogRepository transactionLogRepository;

	public static void main(String[] args) {
		SpringApplication.run(BankappV1Application.class, args);

	}
	
	@Autowired
	private AccountService accountService;
	

	@Override
	public void run(String... args) throws Exception {
		
		//accountService.deposit(2L, 100);
		
		/*
		
		Account account=accountRepository.findById(1L).orElseThrow(RuntimeException::new);
		accountRepository.delete(account);
		
		Customer customer=new Customer("gowsy", "g@gmail.com", "5454545545", "delhi", "delhi", "india");
		Customer customer2=new Customer("yuga", "y@gmail.com", "54598545545", "noida", "UP", "india");
		Customer customer3=new Customer("nagu", "n@gmail.com",
				"5974545545", "banglore", "Karnataka", "india");
		
		Account account=new Account(2000.0, customer, false);
		Account account2=new Account(1000.0, customer2, false);
		Account account3=new Account(2500.0, customer3, false);
		
		customer.setAccount(account);
		customer2.setAccount(account2);
		customer3.setAccount(account3);
		
		accountRepository.save(account);
		accountRepository.save(account2);
		accountRepository.save(account3);
		
		

		User user1=new User("jam", "jam123", "j@j.com", "54545455", "delhi", 
				new String[]{"ROLE_ADMIN","ROLE_MGR","ROLE_CLERK"}, true);
		
		User user2=new User("bhaa", "bhaa123", "bh@bh.com", "54545455", "delhi", 
				new String[]{"ROLE_MGR","ROLE_CLERK"}, true);
		
		User user3=new User("boo", "boo123", "b@b.com", "54545455", "delhi", 
				new String[]{"ROLE_CLERK"}, true);

		User user4=new User("nagu", "nagu123", "n@n.com", "54545455", "delhi", 
				new String[]{"ROLE_CLERK"}, true);
		
		userRepository.save(user1);
		userRepository.save(user2);
		userRepository.save(user3);
		userRepository.save(user4);
		
		*/
		
		

		/*AppUser user1=new AppUser("jam", "jam123", "j@j.com", "54545455", "delhi", 
				new String[]{"ROLE_ADMIN","ROLE_MGR","ROLE_CLERK"}, true);
		
		AppUser user2=new AppUser("bhaa", "bhaa123", "bh@bh.com", "54545455", "delhi", 
				new String[]{"ROLE_MGR","ROLE_CLERK"}, true);
		
		AppUser user3=new AppUser("boo", "boo123", "b@b.com", "54545455", "delhi", 
				new String[]{"ROLE_CLERK"}, true);

		AppUser user4=new AppUser("yuga", "yuga123", "y@y.com", "54545455", "delhi", 
				new String[]{"ROLE_CLERK"}, true);
		
		userRepository.save(user1);
		userRepository.save(user2);
		userRepository.save(user3);
		userRepository.save(user4);*/
	}

}
















