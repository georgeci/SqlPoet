### Declaration
```(kotlin)
object  Role  : SqlPoetTable("role") {
    val id = int("id")
}
```

### Select
```(kotlin)
 select()
.from(Role)
.where()
```