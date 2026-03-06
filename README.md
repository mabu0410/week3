# Tuần 3 - Spring Boot Cơ Bản

🎯 **Mục tiêu:**

* Biết tạo REST API
* Kết nối Database
* Thực hiện CRUD với Spring Boot

---

## Nội dung học & Code

| Nội dung                                                                                                             | Link Code                                                            |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------- |
| Spring Intro & IoC: IOC, Bean, Autowiring, cấu trúc Spring Boot project                                              | https://github.com/your-repo-link/tree/main/spring-intro             |
| Tạo project Spring Boot đơn giản, test REST API `/hello` trả về **Hello World!**                                     | https://github.com/your-repo-link/tree/main/hello-api                |
| Hiểu và giải thích `@Component`, `@Service`, `@Autowired`                                                            | https://github.com/your-repo-link/tree/main/spring-di-example        |
| REST API với Spring Boot: Controller, RequestMapping, `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping` | https://github.com/your-repo-link/tree/main/rest-api-basic           |
| Tạo REST Controller `/products` với các API: <br> `GET /products` <br> `POST /products` <br> `GET /products/{id}`    | https://github.com/your-repo-link/tree/main/product-api              |
| Spring Data JPA: Entity, Repository, CrudRepository, Query Method                                                    | https://github.com/your-repo-link/tree/main/jpa-example              |
| Tạo Entity **Product** (`id`, `name`, `price`, `category`)                                                           | https://github.com/your-repo-link/tree/main/product-entity           |
| Tạo Repository để lưu và tìm kiếm sản phẩm                                                                           | https://github.com/your-repo-link/tree/main/product-repository       |
| Kết nối Database: cấu hình datasource, MySQL/PostgreSQL, file `application.yml` / `application.properties`           | https://github.com/your-repo-link/tree/main/database-config          |
| Kết nối MySQL/PostgreSQL và viết SQL tạo bảng `product`                                                              | https://github.com/your-repo-link/tree/main/sql-schema               |
| Viết API **thêm / sửa / xóa / tìm kiếm sản phẩm**                                                                    | https://github.com/your-repo-link/tree/main/product-crud             |
| Validation & Exception: `@Valid`, `@NotNull`, `GlobalExceptionHandler`                                               | https://github.com/your-repo-link/tree/main/validation-example       |
| Áp dụng `@Valid` để validate Product (name không rỗng, price > 0)                                                    | https://github.com/your-repo-link/tree/main/product-validation       |
| Tạo class `GlobalExceptionHandler` trả về lỗi chuẩn                                                                  | https://github.com/your-repo-link/tree/main/global-exception-handler |

---

## Clean Code

Áp dụng kiến thức từ sách **Clean Code**

Các chương đã đọc và áp dụng:

* Chapter 1: Clean Code
* Chapter 2: Meaningful Names
* Chapter 3: Functions
* Chapter 4: Comments
* Chapter 6: Objects and Data Structures
* Chapter 7: Error Handling
* Chapter 10: Classes

Các chương đọc lướt nếu có thời gian:

* Chapter 8
* Chapter 9
* Chapter 11
* Chapter 12+

---

## Kết quả đạt được

Sau tuần này có thể:

* Tạo REST API bằng Spring Boot
* Kết nối database MySQL/PostgreSQL
* Thực hiện CRUD với Spring Data JPA
* Áp dụng validation và exception handling
* Áp dụng nguyên tắc Clean Code vào project
