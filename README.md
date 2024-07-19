Details Explainaton of flow :
Step 1 : To create the SpringBoot Application using Spring Initialiser
Step 2 : Add Some dependency in pom.xml  
        1)Lombok
        2)Spring Data Jpa
        3)Mysql Driver
        4)Spring Web
Step 3 : In Application.Properties add the details of the database like Username, Password, Database URL 
Step 4 : Divide the Application in Different layers :
         1) Controller - To add endpoint of the API 
         2) Service -  To write the business logic 
         3) Repository - To manage the database and Entity to reflect the actual changes in the database 
         4) Entity - To convert the class Attribute to Table Attribute in the database table 
         There are different types of annotations are use like @Entity,@Restcontroller,@RequestMapping,@PostMapping,@Service,@Repository,@Autowired,@data
Step 5 : Test the API Endpoint in the Postman to check the working 

This is some screenshot of the result in WORKBENCH & POSTMAN: 
![Screenshot (63)](https://github.com/user-attachments/assets/2c0a7f96-589d-4eb9-b90a-b4d059883fea)
![Screenshot (62)](https://github.com/user-attachments/assets/57ef9cd2-836d-4500-890c-fddef86ebbc9)
![Screenshot (61)](https://github.com/user-attachments/assets/30f2ad1b-e9f6-48c4-9cdc-159342df281f)
![Screenshot (60)](https://github.com/user-attachments/assets/4f6e29c8-175d-40ff-9f72-259837516532)
![Screenshot (59)](https://github.com/user-attachments/assets/3f7670bd-ee3f-45b7-b477-7d85db6c56c1)
![Screenshot (59) - Copy](https://github.com/user-attachments/assets/6e5350cd-38b6-485c-accc-da6bcffdec76)




