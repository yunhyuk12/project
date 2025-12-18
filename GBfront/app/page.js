"use client";

import { useEffect, useState } from "react";

export default function Home() {
  const [guestbooks, setGuestbooks] = useState([]);
  const [nickname, setNickname] = useState("");
  const [content, setContent] = useState("");

  useEffect(() => {
    fetch("http://localhost:3000")
      .then((res) => res.json())
      .then((data) => setGuestbooks(data));
  }, []);

  return (
    <main className="p-8 max-w-xl mx-auto">
      <h1 className="text-2xl font-bold mb-4">Guestbook</h1>

      <form className="mb-6">
        <input
          className="border p-2 w-full mb-2"
          placeholder="닉네임"
          value={nickname}
          onChange={(e) => setNickname(e.target.value)}
        />
        <textarea
          className="border p-2 w-full mb-2"
          placeholder="내용"
          value={content}
          onChange={(e) => setContent(e.target.value)}
        />
        <button className="bg-blue-500 text-white px-4 py-2">등록</button>
      </form>

      <ul>
        {guestbooks.map((g) => (
          <li key={g.id} className="border-b py-2">
            <b>{g.nickname}</b>: {g.content}
          </li>
        ))}
      </ul>
    </main>
  );
}
