# Tuần 3 - Spring Boot Cơ Bản

🎯 **Mục tiêu:**

* Biết tạo REST API
* Kết nối Database
* Thực hiện CRUD với Spring Boot

---

## Nội dung học & Code

| Nội dung                                                                                                             | Code                                                                              |
| -------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| Spring Intro & IoC: IOC, Bean, Autowiring, cấu trúc Spring Boot project                                              | [View Code](https://github.com/your-repo-link/tree/main/spring-intro)             |
| Tạo project Spring Boot đơn giản, test REST API `/hello` trả về **Hello World!**                                     | [View Code](https://github.com/your-repo-link/tree/main/hello-api)                |
| Hiểu và giải thích `@Component`, `@Service`, `@Autowired`                                                            | [View Code](https://github.com/your-repo-link/tree/main/spring-di-example)        |
| REST API với Spring Boot: Controller, RequestMapping, `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping` | [View Code](SpringIntro/src/main/java/org/example/springintro/controller/ProductsController.java)           |
| Tạo REST controller `/products` với các API: `GET /products`, `POST /products`, `GET /products/{id}`                 | [View Code](https://github.com/your-repo-link/tree/main/product-api)              |
| Spring Data JPA: Entity, Repository, CrudRepository, query method                                                    | [View Code](https://github.com/your-repo-link/tree/main/jpa-example)              |
| Tạo Entity **Product** (`id`, `name`, `price`, `category`)                                                           | [View Code](https://github.com/your-repo-link/tree/main/product-entity)           |
| Tạo Repository để lưu và tìm kiếm sản phẩm                                                                           | [View Code](https://github.com/your-repo-link/tree/main/product-repository)       |
| Kết nối DB: cấu hình datasource, MySQL/PostgreSQL, file `application.yml` / `application.properties`                 | [View Code](https://github.com/your-repo-link/tree/main/database-config)          |
| Kết nối MySQL/PostgreSQL, viết SQL tạo bảng product                                                                  | [View Code](https://github.com/your-repo-link/tree/main/sql-schema)               |
| Viết API thêm, sửa, xóa, tìm kiếm sản phẩm                                                                           | [View Code](https://github.com/your-repo-link/tree/main/product-crud)             |
| Validation & Exception: `@Valid`, `@NotNull`, GlobalExceptionHandler                                                 | [View Code](https://github.com/your-repo-link/tree/main/validation-example)       |
| Áp dụng `@Valid` để validate Product (name không rỗng, price > 0)                                                    | [View Code](https://github.com/your-repo-link/tree/main/product-validation)       |
| Tạo class `GlobalExceptionHandler` trả về lỗi chuẩn                                                                  | [View Code](https://github.com/your-repo-link/tree/main/global-exception-handler) |

---

## Clean Code

Áp dụng kiến thức từ sách Clean Code:

* Chapter 1: Clean Code
* Chapter 2: Meaningful Names
* Chapter 3: Functions
* Chapter 4: Comments
* Chapter 6: Objects and Data Structures
* Chapter 7: Error Handling
* Chapter 10: Classes

Đọc lướt nếu có thời gian:

* Chapter 8
* Chapter 9
* Chapter 11
* Chapter 12+
