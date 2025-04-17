import { WebPlugin } from '@capacitor/core';

import type { WebSocketServerPlugin } from './definitions';

export class WebSocketServerWeb extends WebPlugin implements WebSocketServerPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
