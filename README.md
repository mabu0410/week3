# Tuần 3 - Spring Boot Cơ Bản

🎯 **Mục tiêu:**

* Biết tạo REST API
* Kết nối Database
* Thực hiện CRUD với Spring Boot

---

## Nội dung học & Code

| Nội dung                                                                                                             | Code                                                                              |
| -------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| Tạo project Spring Boot đơn giản, test REST API `/hello` trả về **Hello World!**                                     | [View Code](SpringIntro/src/main/java/org/example/springintro/HelloController.java)                |
| REST API với Spring Boot: Controller, RequestMapping, `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping` | [View Code](SpringIntro/src/main/java/org/example/springintro/controller/ProductsController.java)           |
| Tạo REST controller `/products` với các API: `GET /products`, `POST /products`, `GET /products/{id}`                 | [View Code](SpringIntro/src/main/java/org/example/springintro/controller/ProductsController.java)              |
| Tạo Entity **Product** (`id`, `name`, `price`, `category`)                                                           | [View Code](SpringJPA/src/main/java/org/example/springjpa/entity/Product.java)           |
| Tạo Repository để lưu và tìm kiếm sản phẩm                                                                           | [View Code](SpringJPA/src/main/java/org/example/springjpa/repository/ProductRepository.java)       |
| Kết nối MySQL/PostgreSQL, viết SQL tạo bảng product                                                                  | [View Code](SpringJPA/src/main/resources/application.properties)               |
| Viết API thêm, sửa, xóa, tìm kiếm sản phẩm                                                                           | [View Code](SpringJPA/src/main/java/org/example/springjpa/controller/ProductController.java)             |
| Validation & Exception: `@Valid`, `@NotNull`, GlobalExceptionHandler                                                 | [View Code](SpringJPA/src/main/java/org/example/springjpa/validation/ProductRequest.java)       |
| Áp dụng `@Valid` để validate Product (name không rỗng, price > 0)                                                    | [View Code](https://github.com/your-repo-link/tree/main/product-validation)       |
| Tạo class `GlobalExceptionHandler` trả về lỗi chuẩn                                                                  | [View Code](SpringJPA/src/main/java/org/example/springjpa/exception/GlobalExceptionHandler.java) |

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
