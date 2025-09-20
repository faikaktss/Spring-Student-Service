# 🎓 Spring Student REST API

Merhaba!  
Bu proje, Spring Boot kullanılarak geliştirilen, öğrenci (student) verilerini yönetebileceğiniz modern ve pratik bir REST API uygulamasıdır.  
Amaç; Spring’in IoC, JPA, Repository ve REST mimarisi gibi temel yapı taşlarını gerçek bir projede uygulamalı olarak göstermek ve öğrenmektir.

---

## 🚀 Özellikler

- Öğrenci ekleme, listeleme, güncelleme ve silme (CRUD)
- Spring Data JPA ile database (veritabanı) işlemleri
- Spring IoC ve Dependency Injection uygulamaları
- Kolay anlaşılır, sade ve yeni başlayanlara uygun kod yapısı

---

## 🏗️ Proje Mimarisi

```
src/main/java/com/faik/
├── Starter/             # Uygulama başlangıç noktası (Spring Boot Application)
├── Controller/          # API endpointleri ve controller implementasyonu
├── Controller/Impl/     # Controller interface implementasyonu
├── Entites/             # JPA entity sınıfı (Student)
├── Repository/          # JPA repository interface'i
├── Services/            # Servis interface'i
└── Services/Impl/       # Servis implementasyonu
```

---

## 🎯 Kullanılan Spring Özellikleri

- `@SpringBootApplication`
- `@RestController`, `@RequestMapping`, `@PostMapping`, `@GetMapping`, `@PutMapping`
- `@Service`, `@Autowired`
- `@Entity`, `@Table`, `@Id`, `@GeneratedValue`
- Spring Data JPA ile `JpaRepository`
- Bean ve Component yönetimi

---

## 📚 API Uç Noktaları (Endpoints)

| Yöntem | Endpoint                      | Açıklama                  |
|--------|-------------------------------|---------------------------|
| POST   | `/rest/api/student/save`      | Yeni öğrenci kaydeder     |
| GET    | `/rest/api/student/list`      | Tüm öğrencileri listeler  |
| GET    | `/rest/api/student/list/{id}` | Belirli öğrenciyi getirir |
| PUT    | `/rest/api/student/update/{id}` | Öğrenciyi günceller     |
| GET    | `/rest/api/student/delete/{id}` | Öğrenciyi siler         |

---

## ⚡ Başlatmak İçin

1. Repoyu klonla:
   ```bash
   git clone https://github.com/faikaktss/spring-student-rest-api.git
   ```
2. Projeyi aç ve başlat:
   ```bash
   ./mvnw spring-boot:run
   ```
   veya
   ```bash
   java -jar target/your-jar-file.jar
   ```
3. API istekleri için Postman veya benzeri bir araç kullanabilirsin.

---

## 💡 Notlar

- Veritabanı bağlantı ayarlarını `application.properties` dosyasından güncelleyebilirsin.
- Kodlar sade tutulmuştur ve öğrenme/pratik odaklıdır.
- Geliştirmeye ve katkıya açıktır!

---

  
