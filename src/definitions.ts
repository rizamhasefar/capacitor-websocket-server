export interface WebSocketServerPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
