# Kafka demo
Create producer and consumer: `mvn clean package`

## Compose
`docker-compose up -d --build` 

## Logs
`docker logs --details --follow --tail 30 kafka-producer`

`docker logs --details --follow --tail 30 kafka-consumer`
