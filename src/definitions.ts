export interface WebSocketServerPlugin {
  startServer(options: { port: number }): Promise<{ status: string }>;
  stopServer(): Promise<{ status: string }>;
  echo(options: { value: string }): Promise<{ value: string }>;
}
