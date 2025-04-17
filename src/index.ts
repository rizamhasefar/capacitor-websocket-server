import { registerPlugin } from '@capacitor/core';

import type { WebSocketServerPlugin } from './definitions';

const WebSocketServer = registerPlugin<WebSocketServerPlugin>('WebSocketServer', {
  web: () => import('./web').then((m) => new m.WebSocketServerWeb()),
});

export * from './definitions';
export { WebSocketServer };
