// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "WebsocketServer",
    platforms: [.iOS(.v14)],
    products: [
        .library(
            name: "WebsocketServer",
            targets: ["WebSocketServerPlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", from: "7.0.0")
    ],
    targets: [
        .target(
            name: "WebSocketServerPlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/WebSocketServerPlugin"),
        .testTarget(
            name: "WebSocketServerPluginTests",
            dependencies: ["WebSocketServerPlugin"],
            path: "ios/Tests/WebSocketServerPluginTests")
    ]
)