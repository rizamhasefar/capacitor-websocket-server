# websocket-server

Websocket Server Plugin

## Install

```bash
npm install websocket-server
npx cap sync
```

## API

<docgen-index>

* [`startServer(...)`](#startserver)
* [`stopServer()`](#stopserver)
* [`echo(...)`](#echo)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### startServer(...)

```typescript
startServer(options: { port: number; }) => Promise<{ status: string; }>
```

| Param         | Type                           |
| ------------- | ------------------------------ |
| **`options`** | <code>{ port: number; }</code> |

**Returns:** <code>Promise&lt;{ status: string; }&gt;</code>

--------------------


### stopServer()

```typescript
stopServer() => Promise<{ status: string; }>
```

**Returns:** <code>Promise&lt;{ status: string; }&gt;</code>

--------------------


### echo(...)

```typescript
echo(options: { value: string; }) => Promise<{ value: string; }>
```

| Param         | Type                            |
| ------------- | ------------------------------- |
| **`options`** | <code>{ value: string; }</code> |

**Returns:** <code>Promise&lt;{ value: string; }&gt;</code>

--------------------

</docgen-api>
