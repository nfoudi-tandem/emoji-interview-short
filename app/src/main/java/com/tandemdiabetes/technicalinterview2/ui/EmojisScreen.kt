package com.tandemdiabetes.technicalinterview2.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.tandemdiabetes.technicalinterview2.Emoji

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmojisScreen() {

    val sorting = remember { SortOrder.ASCENDING }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Emojis")
                },
                actions = {
                    IconButton(
                        onClick = {
                            // TODO Change the sorting of the list
                        }
                    ) {
                        Icon(
                            if (SortOrder.ASCENDING == sorting) Icons.Default.KeyboardArrowDown else Icons.Default.KeyboardArrowUp,
                            contentDescription = "Sorting"
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Transparent)
            )
        }
    ) { padding ->
        Box(modifier = Modifier.padding(padding)) {
            // TODO Implement a list of emojis using the "emojiList" below
        }
    }
}

enum class SortOrder {
    ASCENDING,
    DESCENDING
}

val emojiList = listOf(
    Emoji("Grinning Face", "😀"),
    Emoji("Grinning Face with Big Eyes", "😃"),
    Emoji("Grinning Face with Smiling Eyes", "😄"),
    Emoji("Beaming Face with Smiling Eyes", "😁"),
    Emoji("Grinning Squinting Face", "😆"),
    Emoji("Grinning Face with Sweat", "😅"),
    Emoji("Rolling on the Floor Laughing", "🤣"),
    Emoji("Face with Tears of Joy", "😂"),
    Emoji("Slightly Smiling Face", "🙂"),
    Emoji("Upside-Down Face", "🙃"),
    Emoji("Winking Face", "😉"),
    Emoji("Smiling Face with Smiling Eyes", "😊"),
    Emoji("Smiling Face with Halo", "😇"),
    Emoji("Smiling Face with Hearts", "🥰"),
    Emoji("Smiling Face with Heart-Eyes", "😍"),
    Emoji("Star-Struck", "🤩"),
    Emoji("Face Blowing a Kiss", "😘"),
    Emoji("Kissing Face", "😗"),
    Emoji("Smiling Face", "☺️"),
    Emoji("Kissing Face with Closed Eyes", "😚"),
    Emoji("Kissing Face with Smiling Eyes", "😙"),
    Emoji("Smiling Face with Tear", "🥲"),
    Emoji("Face Savoring Food", "😋"),
    Emoji("Face with Tongue", "😛"),
    Emoji("Winking Face with Tongue", "😜"),
    Emoji("Zany Face", "🤪"),
    Emoji("Squinting Face with Tongue", "😝"),
    Emoji("Money-Mouth Face", "🤑"),
    Emoji("Hugging Face", "🤗"),
    Emoji("Face with Hand Over Mouth", "🤭"),
    Emoji("Shushing Face", "🤫"),
    Emoji("Thinking Face", "🤔"),
    Emoji("Zipper-Mouth Face", "🤐"),
    Emoji("Face with Raised Eyebrow", "🤨"),
    Emoji("Neutral Face", "😐"),
    Emoji("Expressionless Face", "😑"),
    Emoji("Face Without Mouth", "😶"),
    Emoji("Smirking Face", "😏"),
    Emoji("Unamused Face", "😒"),
    Emoji("Face with Rolling Eyes", "🙄"),
    Emoji("Grimacing Face", "😬"),
    Emoji("Lying Face", "🤥"),
    Emoji("Relieved Face", "😌"),
    Emoji("Pensive Face", "😔"),
    Emoji("Sleepy Face", "😪"),
    Emoji("Drooling Face", "🤤"),
    Emoji("Sleeping Face", "😴"),
    Emoji("Face with Medical Mask", "😷"),
    Emoji("Face with Thermometer", "🤒"),
    Emoji("Face with Head-Bandage", "🤕"),
    Emoji("Nauseated Face", "🤢"),
    Emoji("Sneezing Face", "🤧"),
    Emoji("Face Vomiting", "🤮"),
    Emoji("Hot Face", "🥵"),
    Emoji("Cold Face", "🥶"),
    Emoji("Woozy Face", "🥴"),
    Emoji("Dizzy Face", "😵"),
    Emoji("Exploding Head", "🤯"),
    Emoji("Cowboy Hat Face", "🤠"),
    Emoji("Partying Face", "🥳"),
    Emoji("Disguised Face", "🥸"),
    Emoji("Smiling Face with Sunglasses", "😎"),
    Emoji("Nerd Face", "🤓"),
    Emoji("Face with Monocle", "🧐"),
    Emoji("Confused Face", "😕"),
    Emoji("Worried Face", "😟"),
    Emoji("Slightly Frowning Face", "🙁"),
    Emoji("Frowning Face", "☹️"),
    Emoji("Face with Open Mouth", "😮"),
    Emoji("Hushed Face", "😯"),
    Emoji("Astonished Face", "😲"),
    Emoji("Flushed Face", "😳"),
    Emoji("Pleading Face", "🥺"),
    Emoji("Frowning Face with Open Mouth", "😦"),
    Emoji("Anguished Face", "😧"),
    Emoji("Fearful Face", "😨"),
    Emoji("Anxious Face with Sweat", "😰"),
    Emoji("Sad but Relieved Face", "😥"),
    Emoji("Crying Face", "😢"),
)
