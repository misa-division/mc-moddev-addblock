# mc-moddev-addblock

NeoForge 1.21.1 で新しいブロックを追加する練習用 Mod です。

## 現在の内容

- Mod ローダー: NeoForge
- Minecraft バージョン: 1.21.1
- 追加ブロック: `ruby_block`
- 表示名: `ルビーブロック`

## ディレクトリ方針

- `registry/` : 登録処理
- `block/basic/` : 通常ブロック定義
- `block/special/` : 将来の特殊ブロック用
- `assets/` : モデル、テクスチャ、言語ファイル
- `data/` : loot table、recipe など

## 今後の拡張

この構成は、将来的に複数ブロック追加 Mod に拡張しやすいようにしています。
`ruby_block` を土台にして、同じパターンでブロックを増やしていく想定です。

## ビルド

```bash
./gradlew build
```

ビルド後の jar は通常 `build/libs/` に出力されます。
