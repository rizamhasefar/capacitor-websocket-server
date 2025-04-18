import { WebPlugin } from '@capacitor/core';

import type { WebSocketServerPlugin } from './definitions';

export class WebSocketServer extends WebPlugin implements WebSocketServerPlugin {
  startServer(options: { port: number; }): Promise<{ status: string; }> {
    throw new Error('Method not implemented.');
  }
  stopServer(): Promise<{ status: string; }> {
    throw new Error('Method not implemented.');
  }
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
