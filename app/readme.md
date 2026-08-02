# Room + Jetpack Compose

## 1. Versiones (`libs.versions.toml`)

```toml
roomRuntime = "2.6.1"
ksp = "1.9.0-1.0.13"
```

---

## 2. Librerías (`[libraries]`)

```toml
androidx-room-runtime = { group = "androidx.room", name = "room-runtime", version.ref = "roomRuntime" }

androidx-room-ktx = { group = "androidx.room", name = "room-ktx", version.ref = "roomRuntime" }

androidx-room-compiler = { group = "androidx.room", name = "room-compiler", version.ref = "roomRuntime" }
```

---

## 3. Plugin (`[plugins]`)

```toml
kotlin-ksp = { id = "com.google.devtools.ksp", version.ref = "ksp" }
```

---

## 4. build.gradle.kts

Plugins:

```kotlin
alias(libs.plugins.kotlin.ksp)
```

Dependencias:

```kotlin
implementation(libs.androidx.room.runtime)

implementation(libs.androidx.room.ktx)

ksp(libs.androidx.room.compiler)
```

---

## 5. Imports

Usar:

```kotlin
import androidx.room.*
```

---

## Estructura

```
Room
│
├── Entity  → Tabla
├── DAO     → CRUD
└── Database → Conexión
```