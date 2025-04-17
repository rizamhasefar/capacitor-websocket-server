import { registerPlugin } from '@capacitor/core';
import type { WebSocketServerPlugin } from './definitions';

const WebSocketServer = registerPlugin<WebSocketServerPlugin>('WebSocketServer');

export * from './definitions';
export { WebSocketServer };