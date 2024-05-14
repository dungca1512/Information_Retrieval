# Dự án Information_Retrieval

## Mô tả

Dự án Information_Retrieval được viết bằng ngôn ngữ lập trình Scala, nhằm cung cấp các chức năng liên quan đến việc truy xuất thông tin. Dự án bao gồm các tính năng sau:

- **Tìm kiếm văn bản**: Tìm kiếm các từ khóa cụ thể trong một tập tài liệu văn bản.
- **Phân loại văn bản**: Phân loại các tài liệu văn bản vào các chủ đề hoặc danh mục cụ thể.
- **Tóm tắt văn bản**: Tạo tóm tắt ngắn gọn cho các tài liệu văn bản dài.
- **Trích xuất thông tin**: Trích xuất các thông tin cụ thể như tên, địa điểm, số lượng từ các tài liệu văn bản.
- **Phân tích tình cảm**: Phân tích cảm xúc của văn bản, xác định xem nó có tích cực, tiêu cực hay trung lập hay không.

## Công nghệ

- **Scala**: Ngôn ngữ lập trình chính được sử dụng để phát triển dự án.
- **Spark**: Hệ thống xử lý dữ liệu phân tán được sử dụng để tăng tốc độ xử lý các tác vụ truy xuất thông tin.
- **Elasticsearch**: Hệ thống tìm kiếm và phân tích văn bản được sử dụng để lưu trữ và truy vấn các tài liệu văn bản.

## Hướng dẫn sử dụng

### 1. Cài đặt

- Cài đặt Scala và Spark.
- Cài đặt Elasticsearch.


### 2. Chạy dự án

- Clone mã nguồn dự án từ kho lưu trữ GitHub.
- Chạy lệnh `sbt assembly` để biên dịch và đóng gói dự án thành JAR.
- Chạy lệnh `java -jar target/scala-3.2.1/information-retrieval-assembly-0.1.0-SNAPSHOT.jar` để khởi động ứng dụng.

### 3. Sử dụng API

- Dự án cung cấp API RESTful để truy cập các chức năng truy xuất thông tin.
- Tham khảo tài liệu API để biết chi tiết về cách sử dụng các chức năng.