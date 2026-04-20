# Etapa 1 Build con Gradle (compilación y empaquetado)
FROM gradle:8.10-jdk17 AS build
WORKDIR /app
COPY . .
RUN ./gradle build -x test --no-daemon

# Etapa 2 Imagen ligera de runtime (producción)
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copiar el JAR generado desde la etapa de build
COPY --from=build /app/build/libs/*.jar app.jar

# Exponer el puerto de la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]