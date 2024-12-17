# Assignment

## API Documentation

- Swagger UI: `http://localhost:8080/swagger-ui.html`

## Database Access

- H2 Console: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:flowchartdb`
- Username: `sa`
- Password: `password`

## Request Body - Create Flowchart (POST)

```json
{
  "name": "Flowchart 1",
  "nodes": [
    {
      "id": "node1",
      "label": "Node 1"
    },
    {
      "id": "node2",
      "label": "Node 2"
    },
    {
      "id": "node3",
      "label": "Node 3"
    }
  ],
  "edges": [
    {
      "source": "node1",
      "target": "node2"
    },
    {
      "source": "node2",
      "target": "node3"
    }
  ]
}
```
