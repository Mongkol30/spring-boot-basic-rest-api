# Basic Rest API with Spring Boot
## Database
docker-compose script
version: '3.8'

services:
  postgres:
    image: postgres:14
    container_name: my_postgres
    restart: always
    environment:
      POSTGRES_USER: my user name
      POSTGRES_PASSWORD: "my password
      POSTGRES_DB: my db
    ports:
      - "5432:5432"
    volumes:
      - postgres_data:/var/lib/postgresql/data

volumes:
  postgres_data:

## REST Controller

Class Level Annotation   = Annotation ที่ใช้ในระดับคลาส

Method Level Annotation = Annotation ที่ใช้ในระดับเมธอด

@RestController

ประกาศว่าคลาสนี้จะเป็น Controller ในรูปแบบ web service (ระดับคลาส)

@RequestMapping

Map URL หรือ Path เพื่อกำหนดเส้นทางในการเข้าถึง Controller (ระดับคลาส)

@GetMapping

กำหนดการทำงานเมื่อมี Request  ส่งมาในรูปแบบ HTTP Request GET Method (ระดับเมธอด)

@PathVariable

กำหนดตัวแปรหรือข้อมูลเข้าไปทำงานใน Path โดยใช้ร่วมกับ { } ผ่าน Parameter

@RequestBody

ส่งข้อมูลไปทำงาน ผ่านParameter

@PostMapping

กำหนดการทำงานเมื่อมี Request  ส่งมาในรูปแบบ HTTP Request POST Method (ระดับเมธอด)

@PutMapping

กำหนดการทำงานเมื่อมี Request  ส่งมาในรูปแบบ HTTP Request PUT Method (ระดับเมธอด)

@DeleteMapping

กำหนดการทำงานเมื่อมี Request  ส่งมาในรูปแบบ HTTP Request DELETE Method (ระดับเมธอด)
